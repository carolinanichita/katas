package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Users on longer flights like to start a second movie right when their first one ends, but they complain that
// the plane usually lands before they can see the ending. So you're building a feature for choosing two movies
// whose total runtimes will equal the exact flight length.
//Write a method that takes an integer flightLength (in minutes) and an array of integers movieLengths
// (in minutes) and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals
// flightLength.
//When building your method:
//Assume your users will watch exactly two movies
//Don't make your users watch the same movie twice
//Optimize for runtime over memory

//public class FlightTimeMovieTime {
////    O(n) time, O(n) space
//    public static boolean are2MovieTimesEqualToFlightTime(int flightTime, int[] moviesTime) {
//        Set<Integer> seenMovies = new HashSet<>();
//
//        for (int firstMovieTime: moviesTime) {
//            int secondMovieMinutesMatching =  flightTime - firstMovieTime;
//
//            if (seenMovies.contains(secondMovieMinutesMatching)) {
//                return true;
//            }
//            seenMovies.add(firstMovieTime);
//        }
//        return false;
//    }
//}

//What if we wanted the movie lengths to sum to something close to the flight length (say, within 20 minutes)?

public class FlightTimeMovieTime {
    public static boolean are2MovieTimesEqualToFlightTime(int flightTime, int[] moviesTimes) {
        Set<Integer> seenMovies = new HashSet<>();

        for (int firstMovieLength: moviesTimes) {
            int secondMovieLength = flightTime - firstMovieLength;

            Iterator<Integer> it = seenMovies.iterator();
            if (it.hasNext() && (it.next() <= (secondMovieLength+20)) && (it.next() >= (secondMovieLength-20)) ) {
                    return true;
            }
            seenMovies.add(firstMovieLength);
        }
        return false;
    }
}

//What if we wanted to fill the flight length as nicely as possible with any number of movies (not just 2)?
//What if we knew that movieLengths was sorted? Could we save some space and/or time?
