# jms-sender-test-app
A simple spring-boot app testing pushing jms messages to an existing activeMQ queue


# Prerequisits
- java 21 installed - if you currently don't have this installed, you can install it using sdkman! -> https://sdkman.io/


# What does it do?
This app will allow to push a jms message to an existing ActiveMQ queue by passing 2 params to the controller:
  - destination, being the name of the queue
  - message as a String.


# Run the app
You can run the app by executing command: `mvn spring-boot:run` in the root directory of the project.

# Usage
When the app is running on local host:8080 execute the below command to send the message:
`curl -X POST "http://localhost:8080/api/messages/send?destination=<YOUR_QUEUE_NAME>&message=<YOUR_MESSAGE>"`.
