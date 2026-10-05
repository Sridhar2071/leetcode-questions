class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        list1=[]
        mul=1
        for i in range(len(nums)):
            mul=nums[i]*nums[i]
            list1.append(mul)
        list1.sort()
        return list1
