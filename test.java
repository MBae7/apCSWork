public static int numberOfLeapYears(int year1, int year2){
 int n = 0;
 for(int i =0; i<year2-year1; i++)
    if(isLeapYear(year1+i) == true){
         n++;
 }
  reutrn n;
} 

public static int dayOfWeek(int month, int day, int year){
    int weekday = (firstDayOfYear(year)+dayOfYear(month, day, year)-1)%7;
    
    
    return weekday;
    
}

public class StepTracker
{
    private int addDailySteps;
    private int addActiveDays;
    private int totalDays;
    private int activeSteps;
    
    public tr(int activeSteps){
    this.activeSteps = activeSteps;
    }
    
    public static int addDailySteps(steps){
        totalDays++;
        addDailySteps += steps;
        
        if(steps>= activeSteps){
            addActiveDays++;
        }
    }
    
    public static int activeDays(){ 
        return addActiveDays;
    }
    
    public static float averageSteps(){
        float averageSteps = (float)addDailySteps/totalDays;
        return averageSteps;
    }
}



public class GameSpinner
{
    private int sectors;
    private int runValue = 0;
    private int runLength = 0;
    
    public GameSpinner(int sectors){
        this.sectors = sectors; 
    }
    
    public int currentRun(){
        return runLength;
    }
    
    public int spin(){
        int spin = int(Math.random()*sectors+1);
        //wrong: int spin = int(MATH.Random(1,4));
        if (spin == runValue){
            runLength ++;
        }else{
            runLength = 1;
        }
        runValue = spin;
        return spin;
    }
    
    
}


public int getScore(){
int score = 0;
if (levelOne.goalReached()){
    score += levelOne.getPoints();
    if(levelOne.isBonus()){
        score += levelOne.getPoints();*2
    }
    
    if(levelTwo.goalReached()){
    score += levelTwo.getPoints();
        if(levelTwo.isBonus()){
        score += levelTwo.getPoints();*2
    }
        if(levelThree.goalReached()){
        score += levelThree.getPoints();
        
            if(levelThree.isBonus()){
            score += levelThree.getPoints();*2
            }
        }
    }
}
return score;
}

if (levelOne.goalReached()){
    score += levelOne.getPoints();
    
    if(levelTwo.goalReached()){
    score += levelTwo.getPoints();
        
        if(levelThree.goalReached()){
        score += levelThree.getPoints();
        
            
        }
    }
}

if (isBonus()){
score *= 3;
}

return score;
}


public int playManyTimes(int num){
    int highScore = 0;
    for(int i = 0; i< num; i++){
       // Game.play(); 
       play();
        if(Game.getScore()>highScore){
            highScore = getScore();    
            //highScore = Game.getScore();
      }  
    }
    return highScore;
}

//static methods only can use static variables, ClassName.methodName(); instance methods objectName.methodName() (would affect seperate objects)

//confused about subclasses, inheritance?
public class Textbook extends Book{
    private int edition;
    private double price;
    private String title;
    
    public Textbook(String title, double price, int edition){
    this.title = title;
    this.price = price;
    this.edition = edition;
    }
    
    public int getEdition(){ return edition;}
    
    public String getBookInfo(){
        return getTitle()+ "-" + price+ "-"+ edition;
        //return Textbook.getTitle()+ "-" + price+ "-"+ edition;
    }
    
    public boolean canSubstituteFor(Textbook){
        return((edition>Textbook.getEdition())&& title.equals(Texbook.getTitle()));
    }
    
}

//if Animal had h and w as constructor 
//if didn't then would call as super();
public Dog(int h, int w)
{
    super(h,w);
}


//how do preconditions work: conditions you can assume are true 

//why no static
//what is a postcondition: what you need to make happen based off of method (ex allReviews is unchanged, in code can't change)
public double getAverageRating(){
    for(int i = 0; i<allReviews[].size(); i++){
        if (allReviews[i].get == null){
        return null;
        }
    }
    if(allReviews[].size()==0){
    return null;
    }
   double total = 0;
   for(int i = 0; i<allReviews[].size(); i++){
        total += allReviews[i].getRating;
    }
    return total/allReviews[].size();
}

public ArrayList<String> collectComments(){
    
    ArrayList<String> comments = new ArrayList<String>();
    for(int i = 0; i<allReviews[].size(); i++){
        for(int j =0; j<allReviews[i].length()){
            if(allReviews[i].substring(j,j+1).equals("!")){
                 comments.add(allReviews[i].getRating +"-" allReviews[i].getComment());
                 j=allReviews[].size();
            }
        }
     
    }
    return comments;
}

//do I write the preconditions?
//how do I know size of rows and columns
    // for(int row = 0l row < arr.length; row++){}
    // for(int col = 0; col < arr[row].length; col++){}
//for a how do I know if is int, float
public void repopulate(){
int num = 0;
for(int i = 0; i<MAX; i++){
    (int j = 0; j<MAX; j++){
        //while 
        //random int in between 1 and MAX
        (int)(Math.random()*MAX +1);
        //if((int)(Math.random()*10+1)*10)%10 !=0){
     grid[i][j] =  (int)(Math.random()*10+1)*10
    }else{
    j-1;
    }
  }
}

public int countIncreasingCols(){
int increasing = grid[0][0];
int count = 0;
    for(int col = 0; col<grid[0].length(); col++){
        for(int row = 0; row<grid.length(); row++){
        if grid[row][col]= grid[row-1][col]{
       
            row++;
            if(row=grid[].length()){
                count++;
            }
        }else{
        if(row=grid[].length()){
            i++;
        }
        }
        }
       }
    }
    return count;
} 


//better way would be to have boolean ordered = true; and if next column value is decreasing then = false; if 
   
   
//if ever have grid[row-1][col] in if then make sure have row = 1 to start in for loop (balance it out)
    
    reference list?
    
    
    
public int scoreGuess(String guess){
    int score = 0;
    for (int i = 0; i<secret.length(); i++){
        if(secret.substring(i,i+guess.length()).equals(guess)){
            score++;
        }
    }
    return score*guess.length()*guess.length();
}

public String findBetterGuess(String guess1, String guess2){
    int score1 = scoreGuess(guess1);
    int score2 = scoreGuess(guess2);
    
    if(score1> score2){
        return guess1;
    }else if(score2>score1){
        return guess2;
    }else if (score2=score1){
        //return alphabetically greater value???
        
    }
}

"a".compareTo("b") returns -1 bc value of a = 97 and b = 98 
    earlier alphabetically.comparedTo(later alphabetically) returns a negative number
can be used for words too (would compare first letter that doesn't match betweent the words)


public class CombinedTable{
    private Table one;
    private Table two;
    
    CombinedTable(Table one, Table two){
        this.one = one;
        this.two = two;
    }
    
    public boolean canSeat(int people){
        return(people+2<=one.getNumSeats() + two.getNumSeats());
    }
    
    public double getDesirability(){
        double desirability = 0;
        if(one.getHeight()==two.getHeight()){
            desirability = (one.getViewQuality()+two.getViewQuality)\2;
        }else{
            desirability = ((one.getViewQuality()+two.getViewQuality)\2)-10;
        }
    }
}

public void addMembers(String[] names, int gradYear){
    for(int i = 0; i<names.size(); i++){
        MemberInfo student = new MemberInfo(names[i], gradYear, true);
        memberList.add(student);
    }
}

public ArrayList<MemberInfo> removeMembers(int year){
    ArrayList<MemberInfo> grads = new ArrayList<MemberInfo>();
    for(MemberInfo m : memberList){
        if(m.getGradYear()<=year){
            if(m.inGoodStanding()==true){
                grads.add(m);
            }
            memberList.remove(m);
        }
    }
    return grads;
}

//how do I remove without error

public static boolean isNonZeroRow(int[][] array2D, int r){
    for(int i = 0; i<array2D[].size(); i++){
        if(array2D[i][r]==0){
        return false;
        }
    }
    return true;
}


public static int[][] resize(int[][] array2D){
    int r = -1;
    int[][] smaller = new int[array2D[].size()][numNonZeroRows];
    for(int i = 0; i<array2D.size()/array2D[].size(); i++){
        if(array2D.isNonZeroRow(array2D,i)){
        r++;
        for(int j = 0; j<array2D[].size();j++;)
        smaller[r][j] = array2D[i][j];
        }
    }
    return smaller[][];
}


public boolean simulate(){
    int position = 0;
    for(int i = 0; i< maxHops; i++){
        position += hopDistance();
        if(position>=goalDistance){
            return true;
        }else if(position<0){
            return false;
        }
    }
    return false;
}

public double runSimulations(int num){
    double success = 0;
    for(int i = 0; i<num;i++){
        if(simulate()){
            success++;
        }
    }
    return success/num;
}


public WordPairList(String[] words){
    //forgot this
    allPairs = new ArrayList<WordPair>;

    for(int i=0; i<words.size()-1; i++){
        for(int j=i+1; j< words.size(); j++){
            allPairs.add(new WordPair(words[i],words[j]));
        }
    }
}


public int numMatches(){
    //int matches; needs initial value
    int matches = 0;
    for(WordPair a : allPairs){
        if(a.getFirst().equals(a.getSecond())){
            matches ++;
        }
    }
    return matches;
}

public class CodeWordChecker implements StringChecker{
    private int min;
    private int max; 
    private String invalid;
    
    public CodeWordChecker(int min, int max, String invalid){
        this.min = min;
        this.max = max;
        this.invalid = invalid;
    }
    
    public boolean isValid(String str){
        for(str.indexOf(invalid) == -1){
            if(str.length()>=min && str.length()<=max){
            return true;
            }
        }
        return false;
    }
}


public static int[] getColumn(int[][] arr2D, int c){
    int[] getColumn = new int[arr2D[][].size()/arr2D[].size()]();
    for(int i = 0; i<arr2D[]; i++){
        getCollumn[i]=arr2D[i][c];
        }
    }
    return getColumn;
}

public static boolean isLatin(int[][] square){

    if(containsDuplicates(square[0])){
        return false;
    }
    
    //for 2D arrays, array.length = row and array[row].length = collumn;
    //square[0].length returns number of collumns
    for(int i = 0; i<square[].size()-1; i++){
        if(hasAllValues(square[i], square[i+1]) == false){
            return false;
        }
    }
    int[] arr1 = new int[square[0].length]();
    int[] arr2 = new int[square[].size()]();
    for(int collumn = 0; collumn<square.size()-1; collumn++){
        for(int row = 0; row<square[].size()-1; row++){
            arr1[collumn]=square[collumn][row];
            arr2[collumn]=square[collumn+1][row];
        }
      if(hasAllValues(arr1[], arr2[]]) == false){
            return false;
        }  
    return true;
}

25 min


public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                        {14, 2, 5, 4, 8, 2},
                        {45, 12, 13, 5, 2, 1}};
                        
        System.out.println(sumArray(array));
        
    }
    
    // Returns the sum of row row in 2D array array
    public static int sumRow(int[][] array, int row)
    {
        int sumRow = 0;
        for(int col = 0; col<array[0].length; col++){
            sumRow += array[row][col];
        }
        return sumRow;
    }
    
    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int sumArray = 0;
        for(int row = 0; row<array.length; row++){
            sumArray += sumRow(array,row);
        }
        return sumArray;
    }
}


Write the methods

public static int sumRow(int[][] array, int row)
and

public static int sumArray(int[][] array)
sumRow returns the sum of row row in the 2D array called array.

sumArray returns the sum of all of the elements in the 2D array called array. You should use sumRow to implement this method.

In main, print the sum of all the elements in the array.



public void cleanData(double lower, double upper){
    for(int i = 0; i<temperatures.size(); i++){
        if(temperatures.get(i)<lower || temperatures.get(i)>upper){
            temperatures.remove(temperatures.get(i));
            i--;
        }
    }
}

public int longestHeatWave(double threshold){
    int longest = 0;
    int current = 0;
    for(int i = 0; i<temperatures.size(); i++){
        if(temperatures.get(i)>threshold){
            current++;
            if (current>longest){longest = current;}
        }else{
            current = 0;
        }
    }
    return longest;
}

public boolean moveCandyToFirstRow(int col){
    if(box[0][col] != null){
        return true;
    }
    for(int i = 0; i<box.length(); i++){
        if(box[i][col]!=null){
            box[0][col] = box[i][col];
            box[i][col] = null;
            return true;
        }
    }
    return false;
}

public ArrayList<String> getDelimitersList(String[] tokens){
    ArrayList<String> list = new ArrayList<String>();
    for(String t : tokens){
        if(t.equals(openDel)|| t.equals(closeDel)){
            list.add(t);    
        }
    }
    return list;
}

public boolean isBalanced(ArrayList<String> delimiters){
    int open = 0;
    int close = 0;
    for(int i = 0; i< delimiters.length(); i++){
        if(delimeters[i].equals(openDel)){open++;}
        if(delimiters[i].equals(closeDel)){
            close++;
            if(close>open){return false;}
        }
    }
    if(open!=close){
        return false;
    }
    return true;
}

public LightBoard(int numRows, int numCols){
    lights = new boolean[numRows][numCols];
    for(int r = 0; r<numRows; r++){
        for(int c = 0; c<numCols; c++){
            if(MATH.random()*10+1 <5){
                lights[r][c] = true;
            }else{
                lights[r][c] = false;
            }
        }
    }
}

public boolean evaluateLight(int row, int col){
    int on = 0;
    for(int r = 0; r<light.length(); r++){
        if(light[r][col]==true){
            on++;
        }
    }
    if(light[row][col] == true){
        if(on%2==0){
            return false;
        }
    }else{
        if(on%3!=0){
            return false;
        }
    }
    return true;
}


2017
 // i do not get how to do this
public Digits(int num){
    digitList = new ArrayList<Integer>();
   while(num!=0){
       digiList.add(0,num%10);//.add(position,value);
       num/10;
   }
    
}
    
  
public boolean isStrictlyIncreasing(){
    boolean increasing = true;
    int previous = digiList.get[0];
    for(int i = 1; i<digiList.size(); i++){
        if(digiList.get[i]<=previous){
            increasing = false;
        }
        previous = digiList.get[i];
    }
    return increasing;
}

  
                           for(Integer n : digiList){//capitalized bc int object?
                               
                               
public class MultPractice implements StudyPractice{
    private int first;
    private int second;
    public MultPractice(int first, int second){
        this.first = first;
        this.second = second;
    }
    
    public String getProblem(){
        String string = first+" TIMES "+second;
        return string;
    }
    
    public void nextProblem(){
        second++;
    }
}

public void replaceNthOccurrence(String str, int n, String repl){
    int ind = findNthOccurrence(String str, int n);
    if(ind != -1){
    str.substring(ind,ind+repl.length()) = repl;
    }
}
                               
public int findLastOccurence(String str){
    int last = 0;
    for(int i = 0; i<str.length();i++){
        last = findNthOccurence(str,i);
        if(last == -1;){last =findNthOccurence(str,i-1);}
    }
    return last;
}   
                               
public static Position findPosition(int num, int[] intArr){
    Position p = null;
    for(int r = 0; r<intArr.size(); r++){
        for(int c = 0; c<intArr[].size(); c++){
            if(num == intArr[r][c]){
                p = new Position(r,c);//when constructing object needs new in front
            }
        }
    }
    return p;
}                               
                               
public static Position[][] getSuccessorArray(int[][] intArr){
    Position[][] p = new Position[intArr.size()][intArr[].size()];
    
    for(int r = 0; r<intArr.size(); r++){
        for(int c = 0; c<intArr[].size(); c++){
            p[r][c] = findPosition(intArr[r][c]+1,intArr);
        }
    }
    return p;
} 
                               
                               
public class RandomStringChooser(){
    private ArrayList<String> words = new ArrayList<String>();
    public randomStringChooser(Array[] strings){
        int i = 0;
        for(String string : ){
            String[i]= word;
            i++;
        }
    }
    
    public String getNext(){
        int random = MATH.random()*words.size();
        String string = words.get(random);
        if(words.size()<1){
            return "NONE";
        }
        words.remove(random);
        return string;
    }
} 
                               
public RandomLetterChooser(String str){
    String[] RandomLetterChooser = new String[getSingleLetters(String str).length()];
    for(int i = 0; i<RandomLetterChooser.length(); i++){
    RandomLetterChooser[i] = getSingleLetters(String str)[i];
    }
}  
                               
public LogMessage(String message){
    int index = message.indexOf(":");
    machineId = message.subString(0,index);
    description = message.subString(index+1,message.length);
    
} 
                               
public boolean containsWord(String keyword){
    int index = description.indexOf(keyword);//.indexOf not .getIndex()
    if(index=-1){
        return false;
    }
    if((index!=0 && description.substring(index-1,index).equals(" ")==false)||(index+keyword.length()!=description.length() && description.substring(index+keyword.length(),index+keyword.length()+1).equals(" ")==false)){//needs to be index+keyword.length() not just index 
        return false;
    }
    return true;
}
                               
public List<LogMessage> removeMessages(String keyword){
    ArrayList<LogMessage> removed = new ArrayList<LogMessage>;
    for(int i = messageList.length(); i>=0;i--){
        if(messageList.get(i).containsWord(keyword)){
            removed.add(i);
            messageList.remove(i);
        }
    }
    return removed; 
}
// can arraylist be delcared as List<>?
                               
private boolean toBelabeled(int r, int c, boolean[][] blackSquares){
    if(blackSquares[r][c]){
        return false;
    }
    if(c==0||(c !=0 &&blackSquares[r][c-1])||r==0||(r!=0&&blackSqaures[r-1][c])){
        return true;
    }
    return false;
}
//what is boolean[][]
//if length condidtion comes before potentially out of bounds statement is ok?
                               
public Crossword(boolean[][] blackSquares){
    int count = 1;//needs to be 1 not 0 cause counting starts at 1 
    puzzle = new Square[blackSquares.length()][blackSquares[].length()];
    for(int r=0; r<puzzle.length; r++){
        for(int c = 0; c<puzzle[].length; c++){
            if(puzzle[r][c]toBelabeled){
                puzzle[r][c] = Square(false,count);
                count++;
            }else if(blackSquares[r][c]==false){
                puzzle[r][c] = Square(true,0);//0 not null, READ THE QUESTION CLOSER
            }else if(blackSquares[r][c]){
                puzzle[r][c] = Square(true,0);
            }
        }
    }
}
                               
public static int totalLetters(List<String> wordList){
    int total = 0;
    for(String word : wordList){
        total+=word.length();
    }
    return total;
}
                               
public static int basicGapWidth(List<String> wordList, int formattedLen){
    return (int)((formattedLen-totalLetters(wordList))/(wordList.length()-1));//totalLetters(wordList) not wordList.totalLetters() bc method from same class you're in and need to fufill totalLetters parameters
}
//would be wordList.totalLetters() or just totalLetters()
                               
public static String format(List<String> wordList, int formattedLen){
    String string = "";
    int extra = leftoverSpaces(List<String> wordList, int formattedLen);
    for(int i = 0; i<wordList.length(); i++){
        string += wordList.get(i);
        for(int j = 0; j<basicGapWidth(wordlist,formattedLen); j++){
        string+= " ";
        }
        if(extra>0){
            string+=" ";
            extra --;
        }
    }
    return string;
}
                               
                               
                               
public static int numberOfLeapYears(int year1, int year2){
    int count = 0;
    for(int i=year1;i<=year2; i++){
        if(isLeapYear(i)){
            count++;
        }
    }
    return count; 
}
                               
public static int dayOfWeek(int month, int day, int year){
    int day = dayOfYear(month,day, year);
    day = day+firstDayOfYear();
    if(isLeapYear(year)&&month>2){
        day++;
    }
    return (day-1)%7;
}
                               
public class StepTracker{
    private int min;
    private int activeDays;
    private int totalSteps;
    
    public StepTracker(int min){
        this.min = min;
        activeDays=0;
        totalSteps = 0;
    }
    
    
}
                               
public LightBoard(int numRows, int numCols){
    int chance = 0;
    lights = new boolean[numRows][numCols];
    for(int r = 0; r<numRows; r++){
        for(int c = 0; c<numCols; c++){
            chance = Math.random()*10;
            if(chance<4){
                light[r][c] = true;
            }
        }
    }
}
                               
public boolean evaluateLight(int row, int col){
    count = 0;
    boolean light;
    if(lights[row][col]){
        for(light[] r : lights){
            for(light :c r ){
                if(c){
                    count++;
                }
            }
        }
        if (count%2==0){
            return false;
        }else{
            return true;
        }
    }if(!lights[row][col]){
        for(light[] r : lights){
            for(light :c r ){
                if(c){
                    count++;
                }
            }
        }
        if(count%3 == 0){
            return true;
        }
    }
    return false;
}
                               
                               
c,d,c,d,e,a,e,d,b, 10(better/fastest way?)d, c, c(?)(a?)!!!B!!,e,d,e (why not d)(bc random returns in between 0 inclusive and 1 exclusive),d(but why would work)!!B!!(recursive???),d, e,d,b(20), d(?)!, a?, !e (D), d (static),d, !D(C), e, !e (B)(subString.(oneIndex) --> substring of index to end of string), !a(E)(recursive), !c(B)(30),a, b, e,  e
more on recursive (ex 16), a, d, e, d, d, !E(A)(!!!!)
    s
     //(double) applies to what is directly after
    //question: do the question progressively get harder = loosely progressively gets harder sort of
    //can't use dot operator (ex .equals, .get()) on null objects have to use object !=null
    // if code is after recursive call, goes backwards (ex if print is called after would print backwards (value wise))
    //enhanced for loops don't have an index, refers to value so wouldn't have []
    //if applicable set variables to simple number and solve with plugged in values
    //in subclass constructor must use super call to constructer (ex. in square (extends rectanlge) would have super() is reference to rectangle())
           
    
    //declaring/initializing constructors, classes, arraylists, arrays
    
    //go through frqs, mcqs, find areas of struggle, look at/review frqs to remember patterns, etc,  barrons book, short quizzes, do 2015 
    //do 4a of 2015 frq but do unit 5 frq (creating classes) instead of interfaces 
    //1st = method (if statements, loops,ex leapyear/day of week); 2nd = utitlizing a class/creating a class (ex step tracker)(creating entire class); 3rd = array/arraylist; 4th = 2d arrays (could still have constrctor though, initializing intitial values of variables)
    //don't need inheritance for frqs (combined table thing would be closest thing but still not inheritiance)
    //sorting sort of coes up in frqs but not specific types of sorting
    //for MCQ loops: MAKE SURE YOU KNOW WHERE THE LOOP IS STARTING, ITS NOT ALWAYS 0