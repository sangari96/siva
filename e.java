ArrayList primeNumbers = new ArrayList();

for(int i = 2; primeNumbers.Count < 10000; i++) {
    bool divisible = false;

    foreach(int number in primeNumbers) {
        if(i % number == 0) {
            divisible = true;
            break;
        }
    }

    if(divisible == false) {
        primeNumbers.Add(i);
        Console.Write(i + " ");
    }
}
