# Apache Spark
Apache Spark is a unified computing engine and set of libraries for parallel data processing on a computing cluster.


## Hadoop vs Spark:
⭐ Hadoop is slower than Spark
> This is because Hadoop writes data to disk and reads it back from the disk whereas Spark keeps the data in-memory and performs all operations in-memory

⭐ Hadoop is built for batch processing whereas Spark is built for batch as well as streaming processing

⭐ Hadoop is more secure than Spark
> Hadoop uses Kerberos Authentication and ACL Authorization (via YARN) whereas Spark does not have any security mechanism on its own, but all these features are added if HDFS and YARN are used along with spark

⭐ Hadoop replicates data to handle failure whereas Spark uses DAG (Directed Acyclic Graph) to provide fault tolerance


## Architecture:
![image](https://github.com/anushkadeshpande/apache-spark-scratchpad/assets/53345232/4b1710a2-9ddd-49e7-ace3-d0bf517c6c95)


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
