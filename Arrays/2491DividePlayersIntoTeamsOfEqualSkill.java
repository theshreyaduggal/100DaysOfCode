class Solution {
    public long dividePlayers(int[] skill) 
    {
        Arrays.sort(skill);

        int teamSkill = skill[0] + skill[skill.length-1];
        long chem = 0;
        
        for (int i=0; i < skill.length/2; i++) 
        {
            if (skill[i] + skill[skill.length-1-i] != teamSkill) 
            {
                return -1;
            }

            chem = chem + (long) skill[i] * skill[skill.length-1-i];
        }
        
        return chem;   
    }
}