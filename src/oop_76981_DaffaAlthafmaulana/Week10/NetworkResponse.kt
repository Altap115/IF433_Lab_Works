package oop_76981_DaffaAlthafmaulana.Week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)