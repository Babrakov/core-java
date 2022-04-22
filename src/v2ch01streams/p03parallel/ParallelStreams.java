package v2ch01streams.p03parallel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ParallelStreams
{
   public static void main(String[] args) throws IOException
   {
      var contents = Files.readString(
         Paths.get("src/gutenberg/alice30.txt"));
      List<String> wordList = List.of(contents.split("\\PL+"));

      // Very bad code ahead
      var shortWords = new int[10];
      wordList.parallelStream().forEach(s -> 
         {
            if (s.length() < 10) shortWords[s.length()]++;
         });
      System.out.println(Arrays.toString(shortWords));

      // Try again--the result will likely be different (and also wrong)
      Arrays.fill(shortWords, 0);
      wordList.parallelStream().forEach(s -> 
         {
            if (s.length() < 10) shortWords[s.length()]++;
         });
      System.out.println(Arrays.toString(shortWords));

      // Remedy: Group and count
      Map<Integer, Long> shortWordCounts = wordList.parallelStream()
         .filter(s -> s.length() < 10)
         .collect(groupingBy(String::length, counting()));

      System.out.println(shortWordCounts);

      // Downstream order not deterministic
      Map<Integer, List<String>> result = wordList.parallelStream().collect(
         Collectors.groupingByConcurrent(String::length));

      System.out.println(result.get(14));

      result = wordList.parallelStream().collect(
         Collectors.groupingByConcurrent(String::length));

      System.out.println(result.get(14));

      Map<Integer, Long> wordCounts = wordList.parallelStream().collect(
         groupingByConcurrent(String::length, counting()));

      System.out.println(wordCounts);
   }
}
