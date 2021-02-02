# MapReduce-buildSystem
This is a convention hadoop map reduce build system on wordcount problem on a configured hadoop cluster

I used a CloudXLab 5 node real cluster to build this code. My username was `mayukhpay9761` and my `HADOOP_HOME` is at `/user/mayukhpay9761/`

All the commands are executed while I am inside the actual project directory.

```sh
$ hadoop fs -mkdir $HADOOP_HOME/input
$ hadoop fs -put ./input/data.txt $HADOOP_HOME/input/
$ ./build.sh wordCount # This is the jar name, can be anything
$ hadoop jar wordCount.jar mapReduce.Main $HADOOP_HOME/inputs/data.txt $HADOOP_HOME/output
$ hadoop fs -get $HADOOP_HOME/outputs/ .

```
