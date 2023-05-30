def solution(n):
    arr = list(str(n))
    arr.sort(reverse=True)
    arr = int(''.join(arr))
    return arr
