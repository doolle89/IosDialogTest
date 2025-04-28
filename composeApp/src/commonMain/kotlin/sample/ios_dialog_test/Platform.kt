package sample.ios_dialog_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform