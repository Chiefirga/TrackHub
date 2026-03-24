package io.chiefirga.music.catalog.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TrackVariant {
    private final int trackId;
    private final int variantId;
    private final String externalId;
    private final Provider provider;
    private final String rawTitle;
    private final int durationSec;
    private final Artist artist;

    public TrackVariant(int trackId,
                        int variantId,
                        String externalId,
                        Provider provider,
                        String rawTitle,
                        int durationSec,
                        Artist artist) {
        if (externalId.isBlank()) throw new IllegalArgumentException("externalId cannot be blank");
        if (provider == null) throw new IllegalArgumentException("provider cannot be null");
        if (rawTitle.isBlank()) throw new IllegalArgumentException("rawTitle cannot be blank");
        if (durationSec <= 0) throw new IllegalArgumentException("durationSec cannot be negative or zero");

        this.trackId = trackId;
        this.variantId = variantId;
        this.externalId = externalId;
        this.provider = provider;
        this.rawTitle = rawTitle;
        this.durationSec = durationSec;
        this.artist = artist;
    }
}
