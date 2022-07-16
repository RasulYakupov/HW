val n = 5
val k = 3
var new_kids = 0
var old_pairs = 1
var grown_ups = 0
var i = 1
while (i < n){
    new_kids = old_pairs * k
    old_pairs = old_pairs + grown_ups
    grown_ups = new_kids
    i += 1
}
print(old_pairs)