class E2(size: Int, arrayInit: (Int) -> Int) {
    var array = Array(
            size = size,
            arrayInit
    )
}