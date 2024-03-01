package com.test;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class WordCount {
	
	public static Logger LOGGER = LogManager.getLogger(WordCount.class);
	
	private static void wordCount(String fileName) {
		
		LOGGER.info("****** Creating Spark Context ...");
		// Create Spark Context
		SparkConf sparkConf = new SparkConf().setMaster("local").setAppName("Word Counter");
		JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);
		
		LOGGER.info("****** Reading input file ...");
		// Create an RDD
		JavaRDD<String> inputFile = sparkContext.textFile(fileName);
		
		LOGGER.info("****** Extracting words from file ...");
		JavaRDD<String> wordsFromFile = inputFile.flatMap(content -> Arrays.asList(content.split(" ")).iterator());
		
		LOGGER.info("****** Counting word occurrences ...");
		JavaPairRDD countData = wordsFromFile.mapToPair(t -> new Tuple2(t,1)).reduceByKey((x, y) -> (int) x + (int) y);
		
		countData.saveAsTextFile("output");
	}
	
	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		LOGGER.info("****** Creating Spark Context ...");
		
		wordCount("D:\\Learning\\Spark\\test.txt");
		
		Long endTime = System.currentTimeMillis();
		LOGGER.info("****** Completed the task in: " + Long.toString(endTime - startTime));
		
		// with 1 worker node ,took 4013 ms, 4076 ms, 3910 ms 
	}

}
