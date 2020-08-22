# Втора лабораториска вежба по Софтверско инженерство
## Дарко Бундоски, бр. на индекс 171544
### Група на код:
Ја добив групата на код checkPrime

(немаше број на група)

### Control Flow Graph

![171544](https://github.com/buda98/SI_lab2_171544/blob/master/CFG.png)

### Цикломатска комплексност
Цикломатска комплексност на кодот е 6, тоа го добив од формулата E - N + 2P:  Е - број на темиња, N - број на јазли, P - број на завршетоци на програмот. (19 - 17 + 2*2) 

### Тест случаи според критериумот Every Branch

	    @Test
	    public void EveryBranch() {
	        assertEquals(0, SILab2.checkPrime(5));
	        //path => 1 - 2 - 4 - 5 - 6 - 8 - 9 - 10.1 - 10.2 - 11 - 13 - 10.3 - 10.2 - 14 - 15 - 17
	        
	        assertEquals(0, SILab2.checkPrime(-1));
	        //path => 1 - 2 - 3
	        
	        assertEquals(0, SILab2.checkPrime(1));
	        //path => 1 - 2 - 4 - 5 - 6 - 7 - 17
	        
	        assertEquals(0, SILab2.checkPrime(6));
	        //path => 1 - 2 - 4 - 5 - 6 - 8 - 9 - 10.1 - 10.2 - 11 - 12 - 17
	    }

### Тест случаи според критериумот Multiple Conditions 
	    @Test
	    void multipleConditionsTest() {
	    	//if (n == 0 || n == 1) {//6
	        assertEquals(true, SILab2.checkPrime(0)); //(True) AND (X)
	        assertEquals(true, SILab2.checkPrime(1)); //(False) AND (True)
	    }

### Објаснување на напишаните unit tests

#### Објаснување на тестовите од EveryBranch:
Mожни патеки 7:
 * 1: На крајот од оваа гранка тестот враќа False со тоа што ги поминува сите услови освен условот кој е во For циклусот.
 * 2: Оваа гранка враќа исклучок дека бројот не треба да е помал од 0.
 * 3: Од оваа гранка излезот е False затоашто се врши проверка за 0 и 1 како влезови и за нив секогаш враќа False.
 * 4: Во овој случај на излез имаме True затоашто бројот го исполнува условот во for циклусот барем еднаш.

#### Објаснување на тестовите од multipleConditions:
Имаме само 1 Multi Condition statement:
 
условот се состои од 2 променливи и една OR логички оператор 
 * (True) OR (X) - Проверува дали променливате е 0 условот е успешен и не проверува понатаму.
 * (False) OR (True) - Проверува дали променливате е 0 условот е неуспешен и продолжува да проверува дали променливата е 1 што е точно и затоа условот поминува.
