BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
println "Enter your string:"
String input = br.readLine()

Map<Character, Integer> letterMap = new HashMap<Character, Integer>()
String firstRecurrent

for (int i = 0; i < input.length(); ++i) {
    char letter = input.charAt(i)
    Integer value = letterMap.get(letter)
    letterMap.put(letter, value == null ? 1 : value.intValue() + 1)
    if(letterMap.get(letter) == 2){
        firstRecurrent = letter
        break
    }
}

println "The first recurrent character is $firstRecurrent."
