package crimeRate;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class Map extends Mapper<LongWritable, Text, Text, IntWritable> {

    public void map(LongWritable key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString();
        String[] words = line.split(",");
	if ((words.length >= 5) && (words[5] != "Primary Type")){
        	context.write(new Text(words[5]), new IntWritable(1));
	}
    }
}
