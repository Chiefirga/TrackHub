package io.chiefirga.music.catalog.domain;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class Track {
    private final UUID trackId;
    private final String normalizedTitle;
    private final int durationSec;
    private final Artist artist;

    public Track(UUID trackId,
                 String normalizedTitle,
                 int durationSec,
                 Artist artist) {
        if (trackId == null) throw new IllegalArgumentException("Track id cannot be null");
        if (normalizedTitle.isBlank()) throw new IllegalArgumentException("Normalized title cannot be null");
        if (durationSec <= 0) throw new IllegalArgumentException("Duration cannot be negative");
        if (artist == null) throw new IllegalArgumentException("Artist cannot be null");

        this.trackId = trackId;
        this.normalizedTitle = normalizedTitle;
        this.durationSec = durationSec;
        this.artist = artist;
    }
}
