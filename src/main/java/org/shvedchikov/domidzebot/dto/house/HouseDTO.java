package org.shvedchikov.domidzebot.dto.house;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HouseDTO {
    private Long id;
    private Integer number;

    @NotNull
    @JsonProperty("owner_id")
    private Long ownerId;

    @NotNull
    @JsonProperty("domain_id")
    private Long domainId;

    @NotNull
    @JsonProperty("credential_id")
    private Long credentialId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;
}
