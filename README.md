# medilandaFarmApp
This semi-automated data entry system is designed for a food production facility, leveraging a Raspberry Pi 3 (RPi3) and an RFID reader to streamline data collection and processing. The system operates through a Python script that is triggered each time an HTML button is clicked. When an RFID card is scanned, the system captures the card ID, cage number, and timestamp. Subsequently, during egg counting, the counter can enter the relevant data—such as egg count and damaged egg count—while placing the RFID card near the reader attached to the RPi3. This action triggers a Selenium script to read all the information from the RFID card and automatically fill in the remaining form fields.

For analytics, the system transfers data from MySQL to an Elasticsearch instance using Logstash, scheduled to run daily at 6 PM through a Logstash cron trigger. This setup enables the use of a Kibana dashboard to provide real-time insights and visual analytics on production metrics. The entire web application is built on the Play Framework, and video demonstrations of the system's functionality can be viewed under video demos.

Video Demos:
https://www.screencast.com/t/4Pkvj7uitZ

https://www.screencast.com/t/2yyvanCjoe

Kibana Dashboard
![Screenshot of Kibana Dashboard](https://github.com/levidu/medilandaFarmApp/blob/master/Screen%20Shot%202019-09-16%20at%202.54.55%20PM.png)
