package edu.icet.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Department {
    private Long id;
    private String name;
    private String description;
}
