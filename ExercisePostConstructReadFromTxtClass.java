package com.luv2code.springdemo;

import java.io.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class ExercisePostConstructReadFromTxtClass implements FortuneService {

	private String fileName = "E:\\fortune-data.txt";

	private List<String> theFortunes;

	private Random random = new Random();

	@PostConstruct
	private void loadTheFortuenFile() {

		System.out.println(
				">> FileFortuneService: Inside Method load theFortunesFile PostConstruct method of ExercisePostConstructReadFromTxtClass called just after creation of the bean");

		File theFile = new File(fileName);

		System.out.println("Reading fortunes from file: " + theFile);

		System.out.println("File exists: " + theFile.exists());

		// initialise array list
		theFortunes = new ArrayList<String>();

		try (Scanner sc = new Scanner(theFile)) {

			while (sc.hasNextLine()) {
				theFortunes.add(sc.nextLine());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getFortune() {
		int randomIndex = random.nextInt(theFortunes.size());
		return theFortunes.get(randomIndex);

	}

}
