def solution(phone_number):
    x = len(phone_number)
    answer = ((x - 4) * '*') + phone_number[-4:]
    return answer
