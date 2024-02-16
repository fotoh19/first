fun String.initials():String{

    val values = this.split(' ')
    val firstInitials = values[0].substring(0,1)
    val lastInitials = values[1].substring(0,1)
    return "$firstInitials,$lastInitials".uppercase()

}