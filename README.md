# apache-spark-scratchpad

# Installation:
1. Apache Spark
  https://spark.apache.org/downloads.html
2. Winutils
  https://github.com/steveloughran/winutils/blob/master/hadoop-3.0.0/bin/winutils.exe
3. Apache Maven
4. Scala IDE
  https://scala-ide.org/download/sdk.html

Start Spark Master:
spark-class org.apache.spark.deploy.master.Master

Start worker node:
spark-class org.apache.spark.deploy.worker.Worker spark://192.168.1.33:7077
