def solution(d, budget):
    count = 0
    d = sorted(d, reverse = False)
    for i in d:
        if budget - i >= 0:
            budget -= i
            count += 1
    return count
