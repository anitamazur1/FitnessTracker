package pl.wsb.fitnesstracker.healthmetrics.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

import java.time.LocalDate;

@Entity
@Table(name = "Health_Metrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "weight",nullable = false)
    private int weight;

    @Column(name = "height",nullable = false)
    private int height;

    @Column(name = "heartRate",nullable = false)
    private int heartRate;

    public HealthMetrics(
            final long userId,
            final LocalDate date,
            final int weight,
            final int height,
            final int heartRate) {

        this.userId = userId;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.heartRate = heartRate;
    }

}

