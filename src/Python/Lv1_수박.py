def solution(n):
    if n % 2 == 1:
        return (n // 2) * '수박' + '수'
    else:
        return (n // 2) * '수박'
