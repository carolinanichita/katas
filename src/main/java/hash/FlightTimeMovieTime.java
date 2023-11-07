package hash;

import java.util.HashSet;
import java.util.Set;

public class FlightTimeMovieTime {

//    O(n) time, O(n) space
    public static boolean are2MovieTimesEqualToFlightTime(int flightTime, int[] moviesTime) {
        Set<Integer> seenMovies = new HashSet<>();

        for (int firstMovieTime: moviesTime) {
            int secondMovieMinutesMatching =  flightTime - firstMovieTime;

            if (seenMovies.contains(secondMovieMinutesMatching)) {
                return true;
            }
            seenMovies.add(firstMovieTime);
        }
        return false;
    }
}
