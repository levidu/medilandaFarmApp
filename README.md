# medilandaFarmApp
A semi-automated data-entry system for a food production facility. It runs hand in hand with a Raspberry Pi3 and an RFID reader. 

A python script is executed every time an HTML button is clicked. An RFID card checks-in and a selenium event listener passed all the information such as the card ID, cage number and timestamp to the card. Later, the counter who counts the eggs can enter the relevant data such as the egg count, the damage egg count, and place the RFID card near the reader that is attached to the RPi3. This will call the selenium object to read all the information in the RFID card and fill the rest of the form automatically.

For analytics, all the data is passed from MySQL to an Elasticsearch instance using logtash. It is scheduled to take place everyday at 6pm using a logstash cron trigger.

The web application runs on the Play Framework.

Video Demos:
https://www.screencast.com/t/4Pkvj7uitZ

https://www.screencast.com/t/2yyvanCjoe

Kibana Dashboard
![Screenshot of Kibana Dashboard](https://github.com/levidu/medilandaFarmApp/blob/master/Screen%20Shot%202019-09-16%20at%202.54.55%20PM.png)
