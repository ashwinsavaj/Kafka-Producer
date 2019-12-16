# Kafka-Producer
Apache Kafka is an open-source stream-processing software platform. I'm implementing producer with spring boot. Producer can send the message to consumer and Message will store in apache broker.

#Zookeeper
zookeeper is another server which is made by apache.First we need to install zookeeper. Here is the step  to configure.

1. Download zookeeper : https://zookeeper.apache.org/releases.html(28MB)
2. Extract zookeeper file.
3. Set the path in path variable.
4. Change the zoo_sample.cfg to zoo.cfg (zookeeper\conf\zoo.cfg)
4. Run the command on cmd : zkserver

#kafka

Once we have done configuration for zookeeper. we need to start kafka server. here is the configuration for kafka server.

1.Download apache kafka : https://kafka.apache.org/downloads (68MB- User binary download)
2.Extract files.
3. Go to kafka\config\server.properties and make this change
   log.dirs = tmp/logs to log.dirs=\kafka\kafka-logs

4.start your kafka : kafka\bin\windows > kafka-server-start.bat  *\kafka\config\server.properties

#Configuration in spring boot 

Added dependancy : Apache kafka
