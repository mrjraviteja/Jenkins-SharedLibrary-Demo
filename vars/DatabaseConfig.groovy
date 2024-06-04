def call(String domain) {
    def dbUrl
    def dbUser
    def dbPassword

    if (domain == "effigotesting1") {
        dbUrl = "jdbc:postgresql://localhost:5432/effigotesting1"
        dbUser = "postgres"
        dbPassword = "sillicon"
    } else if (domain == "effigotesting2") {
        dbUrl = "jdbc:postgresql://localhost:5432/effigotesting2"
        dbUser = "postgres"
        dbPassword = "sillicon"
    } else {
        return null
    }

    return [dbUrl: dbUrl, dbUser: dbUser, dbPassword: dbPassword]
}