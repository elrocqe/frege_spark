# frege_spark

Runnable modules can be found in src/main/frege

To run application on Apache Spark in a distributed cluster, start master and slaves of your local Apache Spark distribution and set the master inside your application. 

-- run in terminal in the sbin folder of your Apache Spark distribution

./start-master.sh
./start-slave.sh "your-master-url"
-- e.g. ./start-slave.sh spark://Damians-MacBook.local:7077

-- adjust application to link to master
-- e.g. sparkConfig.setMaster "spark://Damians-MacBook.local:7077"


common issues

if you run into StackOverflowError -> increase HeapSize in Eclipse

frege and java builder are needed




