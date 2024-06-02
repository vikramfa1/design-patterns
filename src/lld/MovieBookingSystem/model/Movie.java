package lld.MovieBookingSystem.model;

import lombok.Data;

import java.util.List;

@Data
public class Movie {

    String name;
    List<Actors> castList;
    MovieGenre genre;
    int movieDuration;
}
