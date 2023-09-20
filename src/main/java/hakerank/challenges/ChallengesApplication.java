package hakerank.challenges;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@SpringBootApplication
public class ChallengesApplication {

	public static void main(String[] args)  {
		SpringApplication.run(ChallengesApplication.class, args);

	}

}
