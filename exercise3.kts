val dn = readln().toString()
var res = ""
for (char in dn){
    when (char){
        'A' -> res = res + 'T'
        'C' -> res = res + 'G'
        'G' -> res = res + 'C'
        else -> res = res + 'A'
    }
}
println(res.reversed())