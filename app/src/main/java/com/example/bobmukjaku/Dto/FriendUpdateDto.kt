package com.example.bobmukjaku.Dto

import com.fasterxml.jackson.annotation.JsonProperty

data class FriendUpdateDto(
    @JsonProperty("friendUid")val friendUid: Long
)
