// in this problem we have to maintain the alternate order of positive and negative
// we will give n/2 positive num and n/2 negative num
//[3,-2,4,-1,1,-4] like this
// brute apporach ---- apply loop and seperate postive in an arr and neg. in another arr 
//then at even index put positive arr element and for odd put neg. arr element
// optimal apporach------similar to brute but we not make any seperate arrays
// just putting element in even indexs if num is positive and odd indexs if num is negative
// we are using two pointer in this apporach
