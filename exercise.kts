val dn = readln().toString()
var a = 0
var c = 0
var g = 0
var t = 0
for (char in dn){
    when (char){
        'A' -> a = a + 1
        'C' -> c = c + 1
        'G' -> g = g + 1
        else -> t = t + 1
    }
}
print("${a} ${c} ${g} ${t}")