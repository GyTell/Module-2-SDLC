
//Sources: https://www.geeksforgeeks.org/treemap-in-java/ for help with mapping
import java.util.Map;
import java.util.TreeMap;

    public class TextAnalyzer {
    
        static void countWords(String poem){
       
        Map<String,Integer> tree_map_poem=new TreeMap<>();
 
// Splitting the words based off of a space " ". The original text modified to not include punctuation tools.
// Source: https://ocw.mit.edu/ans7870/6/6.005/s16/classes/02-basic-java/
        String array[]=poem.split(" ");
 
        for(int i=0;i<array.length;i++)
        {
            if(tree_map_poem.containsKey(array[i]))
            {
                tree_map_poem.put(array[i], tree_map_poem.get(array[i])+1);
            }
            else
            {
                tree_map_poem.put(array[i],1);
            }
        }
        
        for(Map.Entry<String,Integer> entry:
                    tree_map_poem.entrySet())
        {
            System.out.println(entry.getKey() + "  Frequency:" + entry.getValue());
        }   
        }
    public static void main(String[] args) {
        String poem = " the raven by edgar allan poe once upon a midnight dreary while I pondered weak and weary over many a quaint and curious volume of forgotten lore while I nodded nearly napping suddenly there came a tapping as of some one gently rapping rapping at my chamber door tis some visiter I muttered tapping at my chamber door only this and nothing more ah distinctly I remember it was in the bleak december and each separate dying ember wrought its ghost upon the floor eagerly I wished the morrow vainly I had sought to borrow from my books surcease of sorrow sorrow for the lost lenore for the rare and radiant maiden whom the angels name lenore nameless here for evermore and the silken sad uncertain rustling of each purple curtain thrilled me filled me with fantastic terrors never felt before so that now to still the beating of my heart I stood repeating tis some visiter entreating entrance at my chamber door some late visiter entreating entrance at my chamber door this it is and nothing more presently my soul grew stronger hesitating then no longer I or madam truly your forgiveness I implore but the fact is I was napping and so gently you came rapping and so faintly you came tapping tapping at my chamber door that I scarce was sure I heard you here I opened wide the door darkness there and nothing more deep into that darkness peering long I stood there wondering fearing doubting dreaming dreams no mortals ever dared to dream before but the silence was unbroken and the stillness gave no token and the only word there spoken was the whispered word lenore this I whispered and an echo murmured back the word lenore merely this and nothing more back into the chamber turning all my soul within me burning soon again I heard a tapping something louder than before surely said I surely that is something at my window lattice let me see then what thereat is and this mystery explore let my heart be still a moment and this mystery explore tis the wind and nothing more open here I flung the shutter when with many a flirt and flutter in there stepped a stately raven of the saintly days of yore not the least obeisance made he not a minute stopped or stayed he but with mien of lord or lady perched above my chamber door perched upon a bust of pallas just above my chamber door perched and sat and nothing more then the ebony bird beguiling my sad fancy into smiling by the grave and stern decorum of the countenance it wore though thy crest be shorn and shaven thou I said art sure no craven ghastly grim and ancient raven wandering from the nightly shore tell me what thy lordly name is on the nights plutonian shore quoth the raven nevermore much I marvelled this ungainly fowl to hear discourse so plainly though its answer little meaning little relevancy bore for we cannot help agreeing that no living human being ever yet was blessed with seeing bird above his chamber door bird or beast upon the sculptured bust above his chamber door with such name as nevermore but the raven sitting lonely on that placid bust spoke only that one word as if its soul in that one word he did outpour nothing farther then he uttered not a feather then he fluttered till I scarcely more than muttered other friends have flown before on the morrow he will leave me as my hopes have flown before then the bird said nevermore startled at the stillness broken by reply so aptly spoken doubtless said I what it utters is its only stock and store caught from some unhappy master whom unmerciful disaster followed fast and followed faster till his songs one burden bore till the dirges of his hope that melancholy burden bore of never nevermore but the raven still beguiling all my sad soul into smiling straight I wheeled a cushioned seat in front of bird and bust and door then upon the velvet sinking I betook myself to linking fancy unto fancy thinking what this ominous bird of yore what this grim ungainly ghastly gaunt and ominous bird of yore meant in croaking nevermore this I sat engaged in guessing but no syllable expressing to the fowl whose fiery eyes now burned into my bosoms core this and more I sat divining with my head at ease reclining on the cushions velvet lining that the lamplight gloated oer but whose velvet violet lining with the lamplight gloating oer she shall press ah nevermore then me thought the air grew denser perfumed from an unseen censer swung by seraphim whose footfalls tinkled on the tufted floor wretch I cried thy god hath lent thee by these angels he hath sent thee respite respite and nepenthe from thy memories of lenore quaff oh quaff this kind nepenthe and forget this lost lenore quoth the raven nevermore prophet said I thing of evil prophet still if bird or devil whether tempter sent or whether tempest tossed thee here ashore desolate yet all undaunted on this desert land enchanted on this home by horror haunted tell me truly I implore is there is there balm in gilead tell me tell me I implore quoth the raven nevermore prophet said I thing of evil prophet still if bird or devil by that heaven that bends above us by that god we both adore tell this soul with sorrow laden if within the distant aidenn it shall clasp a sainted maiden whom the angels name lenore clasp a rare and radiant maiden whom the angels name lenore quoth the raven nevermore be that our sign of parting, bird or fiend I shrieked, upstarting get thee back into the tempest and the nights plutonian shore leave no black plume as a token of that lie thy soul has spoken leave my loneliness unbroken quit the bust above my door take thy beak from out my heart and take thy form from off my door quoth the raven nevermore and the raven never flitting still is sitting still is sitting on the pallid bust of pallas just above my chamber door and his eyes have all the seeming of a demons that is dreaming and the lamp light oer him streaming throws his shadows on the floor and my soul from out that shadow that lies floating on the floor shall be lifted nevermore";
         countWords(poem);
    }}
    
    //Additional sources: https://www.geeksforgeeks.org/initializing-a-list-in-java/, https://www.geeksforgeeks.org/calculate-the-frequency-of-each-word-in-the-given-string/.