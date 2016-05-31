#Mexican Lunch Kata

You go to lunch at your favorite mexican restaurant and order the biggest burrito on the menu.  Service is sometimes slow at this restaurant, but you're willing to put up with it because the food is incredible, and they bring you chips and salsa while you wait.  

You can only eat one basket of chips and still finish the entire burrito.  If your burrito takes too long in the kitchen (say the cook goes on an epic smoke break), you could easily fill up on chips, but you can't eat more than five baskets.  Thus four baskets of chips = one giant burrito in your stomach.  No matter the combination of chips and burrito, or how long the entire meal takes, you will not stop eating until you are full.  It's just that good.

It takes you 10 minutes to eat your first basket of chips, but each subsequent basket takes you 5 more minutes than the previous one.  You can eat the second basket in 15 minutes, the third in 20 minutes, and so on.

Given the following variables, calculate the remaining burrito percentage at the end of the meal: 

1. The time it takes to prepare and serve your burrito
2. The time it takes for the server to notice you need more chips and bring them to you -- for the sake of simplicity, assume that this number is the same between each basket of chips.  The server is consistently available (or unavailable) for your chips needs.

Some example scenarios:

* If it takes 10 minutes or less for your burrito to be served, 0% will be left when you are done.
* If it takes the server 5 minutes to get you another basket of chips, and it takes 120 minutes to serve your burrito, 100% of it will go home with you in a doggie bag.

		120 minutes =
		10 minutes eating chips +
		5 minutes waiting +
		15 minutes eating chips +
		5 minutes waiting +
		20 minutes eating chips +
		5 minutes waiting +
		25 minutes eating chips +
		5 minutes waiting +
		30 minutes eating chips

* If it takes the server 2 minutes to replenish your chip basket, and the burrito takes 33 minutes, 30% will remain at the end.

		33 minutes =
		10 minutes eating chips +
		2 minutes waiting +
		15 minutes eating chips +
		2 minutes waiting +
		4 minutes eating chips

BONUS -- Make other pieces of this equation variable, such as:

1. The initial amount of time it takes for you to eat a basket of chips
2. The time increment for each subsequent basket of chips
3. The number of baskets of chips it takes for you to get full


kitchen time	server time		remaining burrito percentage	baskets of chips
10 				--				0								1
11				1				0								1
60 				50				0								1
100				0				100								5
104				1				100								5
70				0 				75								4
74				1 				75								4
90				5 				75								4
45				0				50								3
48				1 				50								3
25				0				25								2
27				1 				25								2
10.6			0 				1								1.1
98.6 			0				99								4.9
