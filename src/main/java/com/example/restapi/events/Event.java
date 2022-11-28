package com.example.restapi.events;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
/*
  Equals 와 HashCode 구현 시 모든 필드 사용하는데,
  Equals Entity 간에 연관관계가 있을 경우(상호 참조)를 구현한 코드와 HashCode 를 구현한 코드에서 Stack OverFlow 현상이 발생할 수 있다.
 */
@EqualsAndHashCode(of = "id")
public class Event {

    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location;
    private int basePrice;
    private int maxPrice;
    private int limitOfEnrollment;
    private boolean offline;
    private boolean free;
    private EventStatus eventStatus;

}
