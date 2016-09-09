candies = [0] * N # An array of N 0s
for valley_idx in valleys:
    candies[valley_idx] = 1

    cur_idx = valley_idx-1
    cur_candies = 2
    while cur_idx >= 0 and ratings[cur_idx] > ratings[cur_idx+1]:
        candies[cur_idx] = max(candies[cur_idx], cur_candies)
        cur_idx -= 1
        cur_candies += 1

    cur_idx = valley_idx+1
    cur_candies = 2
    while cur_idx < N and ratings[cur_idx] > ratings[cur_idx-1]:
        candies[cur_idx] = max(candies[cur_idx], cur_candies)
        cur_idx += 1
        cur_candies += 1
