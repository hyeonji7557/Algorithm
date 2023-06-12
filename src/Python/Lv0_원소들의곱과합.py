def solution(num_list):
    a = 1
    for i in num_list:
        a *= i
    if a < (sum(num_list) ** 2):
        return 1
    else:
        return 0
