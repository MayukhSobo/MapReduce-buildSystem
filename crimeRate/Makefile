JAR_NAME=`basename $(PWD)`
PROJECT_NAME=$(JAR_NAME)
HADOOP_HOME=/user/mayukhpay9761
DATA=data.txt
INPUT=$(HADOOP_HOME)/data/data.txt
all:
	@echo "Building Jarfile from the source"
	@rm -rf appClasses && mkdir appClasses
	@javac -cp `hadoop classpath` -d appClasses *.java
	@jar -cvf $(JAR_NAME).jar -C appClasses/ .
	@hadoop fs -rm -r -f $(HADOOP_HOME)/output
	@hadoop jar $(JAR_NAME).jar $(PROJECT_NAME).Main $(INPUT) $(HADOOP_HOME)/output
	@hadoop fs -get $(HADOOP_HOME)/output/ .
	@hadoop fs -rm -r $(HADOOP_HOME)/output
run:
	@hadoop fs -rm -r -f $(HADOOP_HOME)/output
	@hadoop jar $(JAR_NAME).jar $(PROJECT_NAME).Main $(INPUT) $(HADOOP_HOME)/output
	@hadoop fs -get $(HADOOP_HOME)/output/ .
	@hadoop fs -rm -r $(HADOOP_HOME)/output
build:
	@echo "Building Jarfile from the source"
	@rm -rf appClasses && mkdir appClasses
	@javac -cp `hadoop classpath` -d appClasses *.java
	@jar -cvf $(JAR_NAME).jar -C appClasses/ .
clean:
	@rm -rf appClasses
	@rm -rf output	
	@rm -f *.jar
.PHONY: all
