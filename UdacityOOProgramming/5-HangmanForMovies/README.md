# Project 2: Guess The Movie
Ok, it's time to build your own project in Java, this time you'll be completing a game where the player gets to guess the movie name given the number of letters in it (pretty much like hangman but with movies)!

The rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of. Your goal is to try to figure out the movie by guessing one letter at a time.

If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point. If you lose 10 points, game over!

BUT the more correct letters you guess the more obvious the movie becomes and at a certain point you should be able to figure it out.

The program will randomly pick a movie title from a text file that contains a large list of movies.

You can download a sample text file to play with from the resources tab or create your own list of movie titles.

Once the computer picks a random title, it will display underscores "_" in place of the real letters, thereby only giving away the number of letters in the movie title.

![image](https://user-images.githubusercontent.com/7481200/52184873-2f49fd80-2800-11e9-8805-34c15fbe764a.png)

Then it will wait for the player to enter their first letter guess.

If the letter was indeed in the word, the underscores "_" that match that letter will be replaced with the correct letter revealing how many letters have matched their guess and where they are.

![image](https://user-images.githubusercontent.com/7481200/52184876-383acf00-2800-11e9-94a9-c9c047598486.png)

If their guess isn't in the movie title, then the output will display the same output as the previous step as well as any letters that have been previously guessed wrong.

![image](https://user-images.githubusercontent.com/7481200/52184881-425ccd80-2800-11e9-868d-6326851ad2a4.png)

Eventually, if the player manages to guess all the letters in the movie title correctly before they lost 10 points, they win

![image](https://user-images.githubusercontent.com/7481200/52184885-4983db80-2800-11e9-9675-6f31fb5ef89b.png)

Everything you need to know to be able to build this game should be covered in the previous lessons, but of course that doesn't mean it has to be easy! It's ok to get stuck and it's absolutely normal for things to not work from the first time.

Just take it step by step, build a small part of the game first, test it and make sure it works and then continue to add more to it.

Aaaand, whenever you reach a roadblock, head to the forum straight away, there are tons of other students and mentors there that will be more than happy to help.

Download the movie list from here, and start coding. Good luck :)
