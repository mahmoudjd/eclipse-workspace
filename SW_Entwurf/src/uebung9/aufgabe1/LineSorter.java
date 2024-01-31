package uebung9.aufgabe1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uebung9.aufgabe2.IntParser;
import uebung9.aufgabe2.IntSplitter;
import uebung9.aufgabe2.Parser;
import uebung9.aufgabe2.Splitter1;
//import uebung9.aufgabe2.StringParser;
//import uebung9.aufgabe2.StringSplitter;

/**
 * Tut irgendwelchen kranken Kram mit Dateien. Oder so.
 */
public class LineSorter<Line extends Comparable<Line>, Word> {

	private Parser<Line> parser;
	private Splitter1<Line, Word> splitter;

	public LineSorter(Parser<Line> parser, Splitter1<Line, Word> splitter) {
		this.splitter = splitter;
		this.parser = parser;
	}

	public static void main(String[] args) throws IOException {
		LineSorter<Integer, Integer> lineSorter = new LineSorter<>(new IntParser(), new IntSplitter());
		lineSorter.run(args);
	}

	public void run(String... args) throws IOException {

		String inputName = args[0];
		String outputName = args[1];
		var input = new FileInputStream(inputName);
		var output = new FileOutputStream(outputName);
		var shouldCount = Boolean.valueOf(args[2]);
		var shouldSort = Boolean.valueOf(args[3]);
		var lines = linesReader(input);
		if (shouldSort) {
			sortLines(lines);
		}

		if (shouldCount) {
			var countOfWords = countWordsInLines(lines);
			printCounts(countOfWords);
		}

		writeLines(lines, output);

	}

	private List<Line> linesReader(FileInputStream input) throws IOException {

		try (var bufferedReader = new BufferedReader(new InputStreamReader(input))) {
			var lines = new ArrayList<Line>();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				lines.add(parser.parse(line));
			}

			return lines;
		}
	}

	private void sortLines(List<Line> listOfLines) {
		boolean deneedSort;
		do {
			deneedSort = needSort(listOfLines);

		} while (deneedSort);

	}

	private boolean needSort(List<Line> lines) {
		boolean linesSwapped = false;
		for (int lineNo = 0; lineNo < lines.size() - 1; lineNo++) {

			if (wrongOrder(lines, lineNo)) {
				swap(lines, lineNo);
				linesSwapped = true;
			}
		}
		return linesSwapped;
	}

	private boolean wrongOrder(List<Line> lines, int lineNo) {
		Line firstLine = lines.get(lineNo);
		Line followingLine = lines.get(lineNo + 1);
		return firstLine.compareTo(followingLine) > 0;
	}

	private void swap(List<Line> lines, int lineNo) {
		Line temp = lines.get(lineNo);
		lines.set(lineNo, lines.get(lineNo + 1));
		lines.set(lineNo + 1, temp);

	}

	private Map<Word, Integer> countWordsInLines(List<Line> lines) {
		var counts = new HashMap<Word, Integer>();
		for (Line line : lines) {
			countWordsInLine(line, counts);
		}
		return counts;

	}

	private void countWordsInLine(Line line, Map<Word, Integer> counts) {

		var words = splitter.split(line);
		for (Word word : words)
			incrementCounter(word, counts);
	}

	private void incrementCounter(Word word, Map<Word, Integer> counts) {
		if (counts.containsKey(word)) {
			counts.put(word, counts.get(word) + 1);
		} else {
			counts.put(word, 1);
		}
	}

	private void printCounts(Map<Word, Integer> countOfWords) {

		for (Word key : countOfWords.keySet()) {

			System.out.println(key + " " + countOfWords.get(key));
		}
	}

	private void writeLines(List<Line> lines, FileOutputStream output) {
		try (var pWriter = new PrintWriter(output)) {
			lines.forEach(pWriter::println);
		}

	}
}