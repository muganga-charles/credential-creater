import random


def random_string(numberString1):

    return ''.join(random.choice(numberString1) for i in range(5))
def alpha_string(alpherbet_Upper):
    return ''.join(random.choice(alpherbet_Upper) for i in range(1))
def numericInReg_number(numberString):
    return''.join(random.choice(numberString)for i in range(2))
def numericInReg_numberLast(numberString):
    return''.join(random.choice(numberString)for i in range(2))

def main():
    numberString1='1234567890'
    alpherbet_Upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    print("the access number is {}".format(alpha_string(alpherbet_Upper='A')+random_string(numberString1)))
    print("the resgistration number is {}".format(alpha_string(alpherbet_Upper='J')+numericInReg_number(numberString1)+alpha_string(alpherbet_Upper='B')+numericInReg_number(numberString1)+"/"+numericInReg_numberLast(numberString1)))
main()