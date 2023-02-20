const words = ["apple", "apple","oranges","and","and","and","oranges","aople"]

const wordList = {}

//for loop to count the words
for(let i=0; i<words.length; i++){
    if(wordList.hasOwnProperty(words[i])){
        wordList[words[i]] += 1
    }else{
        wordList[words[i]] = 1
    }
}

console.log(sortObjectEntries(wordList))

//function to sort the hashmap values
function sortObjectEntries(obj){
    let sortedList = []
    
    sortedList = Object.entries(obj).sort((a,b)=>{
        if(b[1] > a[1]) return 1
        else if(b[1] < a[1]) return -1
        else {
         if(a[0] > b[0]) return 1
         else if(a[0] < b[0]) return -1
         else return 0
        }
    })
    return sortedList.map(el=>el[0]).slice(0,2)
}