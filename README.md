ABSTRACT
In the rapidly growing Internet of Things (IoT) ecosystem, ensuring secure data sharing between devices is a significant challenge due to the centralized nature and limited computational resources of IoT devices. Traditional encryption methods struggle to balance security and performance in these environments. This project proposes a blockchain-based proxy re-encryption (PRE) scheme to secure data sharing in IoT networks. By leveraging proxy re-encryption, data owners can securely delegate decryption rights to authorized devices without exposing the original encryption keys. Blockchain technology ensures a tamper-proof and transparent mechanism for managing access control and encryption key delegation.
 
INTRODUCTION

•	In today's digital age, the secure sharing of data has become more critical than ever.
•	With increasing concerns over privacy, data breaches, and unauthorized access, organizations and individuals alike are seeking reliable solutions to protect sensitive information.
•	Hence exploring secure data sharing techniques, challenges and best practices to ensure confidentiality, integrity, and trust in data exchange is essential.
 
OBJECTIVES

•	To ensure secure, decentralized access control without relying on a central authority.
•	To enhance the scalability and efficiency of IoT-cloud data sharing by optimizing computational performance and minimizing latency.
•	To reduce the computational burden on IoT devices while maintaining strong security.
 
EXISTING SYSTEM

•	The conventional data security and sharing mechanisms are primarily based on centralized models, where a trusted third party manages access control, authentication, and data integrity.
•	These models are commonly implemented in various domains, including healthcare, industrial IoT, and cloud storage systems.
 
DISADVANTAGES
•	Centralized data sharing.

•	Vulnerability to breaches.

•	Dependency on trusted third parties.

•	Single points of failure.

•	Potential data leaks.
 
PROPOSED SYSTEM

•	To address the limitations of traditional centralized security models, a blockchain-based proxy re-encryption framework is introduced.
•	The proposed system leverages blockchain technology to ensure decentralization, immutability, and transparency, while proxy re- encryption enables secure and efficient data sharing without exposing plaintext data.
 
ADVANTAGES
•	Enhanced Security and Data Integrity

•	Decentralization and Elimination of Single Points of Failure

•	Improved Access Control and Data Ownership

•	Scalability and Performance Optimization

•	Transparency and Accountability

•	Reduced Reliance on Trusted Third Parties
 

 
MODULES
•	The proposed system consists of five main modules:

•	Data User

•	Data Owner

•	Trust Authority

•	Proxy Server

•	Cloud Service Provider (CSP)
 
DATA USER
The Data User is an entity that requests access to encrypted files uploaded by the data owner. The trust authority verifies their credentials before granting access.
 
DATA OWNER
The Data Owner is responsible for uploading encrypted data to the cloud, managing user requests, and handling encryption key management. Ensures the confidentiality and security of the data by uploading encrypted information to the cloud, safeguarding it from unauthorized access.
 
TRUST AUTHORITY
The	Trust	Authority	is	responsible	for	user	authentication, authorization, and encryption key distribution.
PROXY SERVER
The Proxy Server acts as an intermediary, handling re-encryption requests and ensuring secure data sharing without exposing the original encryption keys.

CLOUD SERVICE PROVIDER
The Cloud Service Provider is responsible for storing encrypted files and ensuring their availability for authorized users.

CONCLUSION

•	Blockchain and proxy re-encryption offer a secure, decentralized solution for IoT data sharing amidst growing device connections and data volumes.
•	Prioritizing privacy and security is crucial, and these technologies provide the means to achieve it and to explore their potential for IoT projects.
 
FUTURE WORK
•	While the project achieved its primary objectives, there are several areas where improvements and additional features could enhance its functionality.
•	One of the key enhancements could be integrating advanced cryptographic techniques, such as homomorphic encryption or blockchain-based security models, to further improve data protection and trustworthiness.
•	Additionally, implementing an AI- driven anomaly detection system could help identify potential unauthorized access attempts in real time, strengthening overall security.
