# apache-spark-scratchpad

### Setup:
1. Apache Spark: <br>
   https://spark.apache.org/downloads.html
2. Winutils: <br>
   https://github.com/steveloughran/winutils/blob/master/hadoop-3.0.0/bin/winutils.exe
3. Hadoop dll: <br>
   https://github.com/steveloughran/winutils/blob/master/hadoop-3.0.0/bin/hadoop.dll
4. Apache Maven <br>
5. Scala IDE <br>
   https://scala-ide.org/download/sdk.html

### Steps:
1. Start Spark Master:
```
spark-class org.apache.spark.deploy.master.Master
```

2. Start worker node:
```
spark-class org.apache.spark.deploy.worker.Worker spark://192.168.1.33:7077
```
