import hash.FlightTimeMovieTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTimeMovieTimeTest {

    @Test
    public void EightyMinutesMovieTimeEquals2MoviesTest() {
        int flightTime = 80;
        int[] movieTimes = {52, 39, 30, 25, 40, 56, 50};
        boolean result = FlightTimeMovieTime.are2MovieTimesEqualToFlightTime(flightTime, movieTimes);

        assertTrue(result);
    }

    @Test
    public void assertFalseForFlightTimeShorterThen2MoviesTimeTest() {
        int flightTime = 8;
        int[] movieTimes = {52, 39};
        boolean result = FlightTimeMovieTime.are2MovieTimesEqualToFlightTime(flightTime, movieTimes);

        assertFalse(result);
    }

    @Test
    public void assertTrueForMorePossibleCombinationsTest() {
        int flightTime = 5;
        int[] movieTimes = {1,2,3,4,5};
        boolean result = FlightTimeMovieTime.are2MovieTimesEqualToFlightTime(flightTime, movieTimes);

        assertTrue(result);
    }

    @Test
    public void assertFalseOneMovieTest() {
        int flightTime = 5;
        int[] movieTimes = {5};
        boolean result = FlightTimeMovieTime.are2MovieTimesEqualToFlightTime(flightTime, movieTimes);

        assertFalse(result);
    }

    @Test
    public void assertFalseNoMoviesTest() {
        int flightTime = 5;
        int[] movieTimes = {};
        boolean result = FlightTimeMovieTime.are2MovieTimesEqualToFlightTime(flightTime, movieTimes);

        assertFalse(result);
    }

    //What if we wanted the movie lengths to sum to something close to the flight length (say, within 20 minutes)?

    @Test
    public void assertTrueFor2MovieLengthsAreInTheCeilingPossibleTimeFLightRange() {
        int flightTime = 120;
        int[] movieTimes = {80,160,90,40};
        boolean result = FlightTimeMovieTime.are2MovieTimesEqualToFlightTime(flightTime, movieTimes);

        assertTrue(result);
    }

}