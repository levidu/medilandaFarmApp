# medilandaFarmApp

This is an semi-automated data-entry system to a food production facility in Sri Lanka. It runs hand in hand with a Raspberry Pi3 and a RFID reader. It calls runs a python script every time a HTML button is clicked (touched). Initially, the person who carries the egg crate takes an RFID card and checks-in. Using selenium event listeners, all the information such as the card ID, cage number and timestamp is passed to the card. Later, the user who counts the eggs can enter the relevant data such as the egg count, the damage egg count, and place the RFID card to the reader that is attached to the RPi3. This would use selenium to automatically read all the information in the RFID card and fill the rest of the form automatically.

For analytics, all the data is passed from MySQL to an Elasticsearch instance using logtash.

Play! framework is using to code the web app.

Video Demos:

https://www.screencast.com/t/4Pkvj7uitZ

https://www.screencast.com/t/2yyvanCjoe

Kibana Dashboard
![Screenshot of Kibana Dashboard](https://github.com/levidu/medilandaFarmApp/blob/master/Screen%20Shot%202019-09-16%20at%202.54.55%20PM.png)
